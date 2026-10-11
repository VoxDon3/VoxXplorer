.class public final synthetic Lax/Z0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;ZI)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/t;->a:Lax/Z0/c$a;

    iput-boolean p2, p0, Lax/Z0/t;->b:Z

    iput p3, p0, Lax/Z0/t;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/t;->a:Lax/Z0/c$a;

    iget-boolean v1, p0, Lax/Z0/t;->b:Z

    iget v2, p0, Lax/Z0/t;->c:I

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, p1}, Lax/Z0/u0;->Y0(Lax/Z0/c$a;ZILax/Z0/c;)V

    return-void
.end method
