.class public final synthetic Lax/Z0/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;IZ)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/Z;->a:Lax/Z0/c$a;

    iput p2, p0, Lax/Z0/Z;->b:I

    iput-boolean p3, p0, Lax/Z0/Z;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/Z;->a:Lax/Z0/c$a;

    iget v1, p0, Lax/Z0/Z;->b:I

    iget-boolean v2, p0, Lax/Z0/Z;->c:Z

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, p1}, Lax/Z0/u0;->A1(Lax/Z0/c$a;IZLax/Z0/c;)V

    return-void
.end method
