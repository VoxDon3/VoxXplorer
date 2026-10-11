.class public final synthetic Lax/Z0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Lax/P0/c;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Lax/P0/c;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/l;->a:Lax/Z0/c$a;

    iput-object p2, p0, Lax/Z0/l;->b:Lax/P0/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Z0/l;->a:Lax/Z0/c$a;

    iget-object v1, p0, Lax/Z0/l;->b:Lax/P0/c;

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, p1}, Lax/Z0/u0;->B0(Lax/Z0/c$a;Lax/P0/c;Lax/Z0/c;)V

    return-void
.end method
