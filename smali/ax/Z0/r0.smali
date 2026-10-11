.class public final synthetic Lax/Z0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/r0;->a:Lax/Z0/c$a;

    iput-boolean p2, p0, Lax/Z0/r0;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Z0/r0;->a:Lax/Z0/c$a;

    iget-boolean v1, p0, Lax/Z0/r0;->b:Z

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, p1}, Lax/Z0/u0;->X0(Lax/Z0/c$a;ZLax/Z0/c;)V

    return-void
.end method
